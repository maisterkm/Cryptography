package org.example;

import org.example.cipher.CeasarCipher;

public class App
{
    public static void main( String[] args )
    {

        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        CeasarCipher cipher = new CeasarCipher();

        String cipherText = cipher.encrypt(text, 3);
        System.out.println(cipherText);

        System.out.println(cipher.decrypt(cipherText, 3));
    }
}
