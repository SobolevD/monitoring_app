package org.example.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.entity.docker.DockerContainerInfo;
import org.example.model.entity.docker.DockerImageInfo;
import org.example.model.entity.docker.DockerVersionInfo;
import org.example.utils.CommandExecutor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DockerService {

    private static final String GET_CONTAINERS_LIST_JSON_COMMAND = "docker ps -a --format \\\"{{json .}}\\\"";
    private static final String GET_VERSION_JSON_COMMAND = "docker version --format \\\"{{json .}}\\\"";
    private static final String GET_IMAGES_JSON_COMMAND = "docker images --format \\\"{{json .}}\\\"";

    public List<DockerContainerInfo> getAllDockerContainersInfo()
            throws IOException, InterruptedException {
        List<DockerContainerInfo> dockerContainersInfo = new ArrayList<>();
        File dockerContainersInfoFile = CommandExecutor.executeWithPowershellAndGetOutput(GET_CONTAINERS_LIST_JSON_COMMAND);

        try (BufferedReader br = new BufferedReader(new FileReader(dockerContainersInfoFile))) {

            String line;
            while ((line = br.readLine()) != null) {

                line = line.replaceAll("[^A-Za-zА-Яа-я0-9-{}\"=+;%, :]", "");
                line = line.replaceAll("\"Command\":\"\"docker-entrypoint\"\"", "\"Command\":\"docker-entrypoint\"");

                if (line.length() == 0) {
                    continue;
                }

                DockerContainerInfo containerInfo = new ObjectMapper().readValue(line, DockerContainerInfo.class);
                dockerContainersInfo.add(containerInfo);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return dockerContainersInfo;
    }

//    public DockerVersionInfo getDockerVersionInfo()
//            throws IOException, InterruptedException {
//        File dockerVersionInfoFile = CommandExecutor.executeWithPowershellAndGetOutput(GET_VERSION_JSON_COMMAND);
//
//        try (BufferedReader br = new BufferedReader(new FileReader(dockerVersionInfoFile))) {
//
//            String line;
//            while ((line = br.readLine()) != null) {
//
//                line = line.replaceAll("[^A-Za-zА-Яа-я0-9-{}\"=+;%, :/\\\\]", "");
//
//                if (line.length() == 0) {
//                    continue;
//                }
//
//                return new ObjectMapper().readValue(line, DockerVersionInfo.class);
//            }
//            return null;
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }

    public List<DockerImageInfo> getAllDockerImagesInfo()
            throws IOException, InterruptedException {

        List<DockerImageInfo> dockerImagesInfo = new ArrayList<>();
        File dockerImagesInfoFile = CommandExecutor.executeWithPowershellAndGetOutput(GET_IMAGES_JSON_COMMAND);

        try (BufferedReader br = new BufferedReader(new FileReader(dockerImagesInfoFile))) {

            String line;
            while ((line = br.readLine()) != null) {

                line = line.replaceAll("[^A-Za-zА-Яа-я0-9-{}\"=+;%, :/\\\\]", "");

                if (line.length() == 0) {
                    continue;
                }

                DockerImageInfo imageInfo = new ObjectMapper().readValue(line, DockerImageInfo.class);
                dockerImagesInfo.add(imageInfo);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return dockerImagesInfo;
    }
}
