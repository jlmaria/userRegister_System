package model;

public class Hash {

    public static String getHash(String txt, String hashType) {

        try {

            java.security.MessageDigest md = java.security.MessageDigest.
                    getInstance(hashType);

            byte[] array = md.digest(txt.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : array) {

                sb.append(Integer.toHexString((b & 0xFF) | 0x100), 1, 3);

            }

            return sb.toString();

        } catch (java.security.NoSuchAlgorithmException e) {

            System.out.println(e.getMessage());

        }

        return null;

    }

    public static String sha1(String txt) {

        return Hash.getHash(txt, "SHA1");

    }

}