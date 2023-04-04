//package org.example.listeners;
//
//import org.jnativehook.GlobalScreen;
//import org.jnativehook.NativeHookException;
//import org.jnativehook.keyboard.NativeKeyEvent;
//import org.jnativehook.keyboard.NativeKeyListener;
//
//import java.util.Set;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//public class GlobalKeyListener implements NativeKeyListener {
//
//    private final Set<String> INPUT_BLACK_LIST = Set.of("test", "king");
//
//    private final Set<Integer> SPECIAL_KEYS =
//            Set.of(NativeKeyEvent.VC_SHIFT_R,
//                    NativeKeyEvent.VC_SHIFT_L,
//                    NativeKeyEvent.VC_ESCAPE,
//                    NativeKeyEvent.VC_ENTER,
//                    NativeKeyEvent.VC_CONTROL_L,
//                    NativeKeyEvent.VC_CONTROL_R,
//                    NativeKeyEvent.VC_ALT_L,
//                    NativeKeyEvent.VC_ALT_R,
//                    NativeKeyEvent.VC_BACKSPACE,
//                    NativeKeyEvent.VC_TAB);
//
//    private final int DIFFERENCE_RUS_ENG = 'а' - 'a';
//
//    private static StringBuilder lastString = new StringBuilder();
//
//    public void nativeKeyPressed(NativeKeyEvent e) {
//        //System.out.println("Key Pressed: " + NativeKeyEvent.getKeyText(e.getKeyCode()));
//
//        if (!SPECIAL_KEYS.contains(e.getKeyCode())) {
//            String t = NativeKeyEvent.getKeyText(e.getKeyCode());
//            if ("space".equalsIgnoreCase(t)) {
//                lastString.append(" ");
//            } else {
//                lastString.append(t.toLowerCase());
//            }
//
//        }
////        if (e.getKeyCode() == NativeKeyEvent.VC_ESCAPE) {
////            try {
////                GlobalScreen.unregisterNativeHook();
////            } catch (NativeHookException ex) {
////                throw new RuntimeException(ex);
////            }
////        }
//
//        if (e.getKeyCode() == NativeKeyEvent.VC_BACKSPACE) {
//            int inputLength = lastString.length();
//
//            if (inputLength == 0) {
//                return;
//            }
//
//            System.out.println("Last string:" + lastString);
//
//            String stringWithoutLastSymbol = lastString.substring(0, inputLength - 1);
//
//            System.out.println("New string:" + stringWithoutLastSymbol);
//
//            lastString = new StringBuilder(stringWithoutLastSymbol);
//        }
//
//        if (e.getKeyCode() == NativeKeyEvent.VC_ENTER) {
//
//            String engUserInput = lastString.toString();
//
//            String rusUserInput = makeRus(engUserInput);
//
//            for (String blackWord : INPUT_BLACK_LIST) {
//                if (engUserInput.contains(blackWord) || rusUserInput.contains(blackWord)) {
//                    System.out.println("User entered (eng): " + engUserInput);
//                    System.out.println("User entered (rus): " + rusUserInput);
//                    return;
//                }
//            }
//
//            lastString = new StringBuilder();
//        }
//
//    }
//
//    public void nativeKeyReleased(NativeKeyEvent e) {
//        //System.out.println("Key Released: " + NativeKeyEvent.getKeyText(e.getKeyCode()));
//    }
//
//    public void nativeKeyTyped(NativeKeyEvent e) {
//        //System.out.println("Key Typed: " + e.getKeyText(e.getKeyCode()));
//    }
//
//    private String makeRus(String engString) {
//
//        StringBuilder rusString = new StringBuilder();
//
//        char[] chars = engString.toCharArray();
//
//        for (char currentChar : chars) {
//            switch (currentChar) {
//                case 'q': rusString.append('й'); break;
//                case 'w': rusString.append('ц'); break;
//                case 'e': rusString.append('у'); break;
//                case 'r': rusString.append('к'); break;
//                case 't': rusString.append('е'); break;
//                case 'y': rusString.append('н'); break;
//                case 'u': rusString.append('г'); break;
//                case 'i': rusString.append('ш'); break;
//                case 'o': rusString.append('щ'); break;
//                case 'p': rusString.append('з'); break;
//                case '[': rusString.append('х'); break;
//                case ']': rusString.append('ъ'); break;
//                case 'a': rusString.append('ф'); break;
//                case 's': rusString.append('ы'); break;
//                case 'd': rusString.append('в'); break;
//                case 'f': rusString.append('а'); break;
//                case 'g': rusString.append('п'); break;
//                case 'h': rusString.append('р'); break;
//                case 'j': rusString.append('о'); break;
//                case 'k': rusString.append('л'); break;
//                case 'l': rusString.append('д'); break;
//                case ';': rusString.append('ж'); break;
//                case '\'': rusString.append('э'); break;
//                case 'z': rusString.append('я'); break;
//                case 'x': rusString.append('ч'); break;
//                case 'c': rusString.append('с'); break;
//                case 'v': rusString.append('м'); break;
//                case 'b': rusString.append('и'); break;
//                case 'n': rusString.append('т'); break;
//                case 'm': rusString.append('ь'); break;
//                case ',': rusString.append('б'); break;
//                case '.': rusString.append('ю'); break;
//                case '/': rusString.append('.'); break;
//                case '`': rusString.append('ё'); break;
//                default: rusString.append(currentChar);
//            }
//        }
//
//        return rusString.toString();
//    }
//
//    public static void main(String[] args) {
//        try {
//            Logger logger = Logger.getLogger(GlobalScreen.class.getPackage().getName());
//            logger.setLevel(Level.OFF);
//            GlobalScreen.registerNativeHook();
//        }
//        catch (NativeHookException ex) {
//            //System.err.println("There was a problem registering the native hook.");
//            //System.err.println(ex.getMessage());
//
//            System.exit(1);
//        }
//
//        GlobalScreen.addNativeKeyListener(new GlobalKeyListener());
//    }
//}
