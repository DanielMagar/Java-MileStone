package DAY3;

/**
 * What is Unicode system ?
 * - The Unicode system is a global standard for encoding, representing, and handling text expressed in most of the world's writing systems. 
 * - It assigns a unique number (code point) to every character, regardless of platform, program, or language, ensuring consistent representation of text across different systems.
 * ########
 * _______Key Concepts of Unicode____:
 * 1. Code Points:
     - Every character in Unicode has a unique identifier called a code point. 
     - It's typically written in hexadecimal and prefixed with U+. For example, the code point for the letter "A" is U+0041.
   
   2. Encoding Forms: Unicode defines several encoding forms for converting these code points into bytes:

    - UTF-8: A variable-length encoding (1 to 4 bytes per character). Commonly used because it is efficient for ASCII characters (1 byte).
    - UTF-16: Uses 2 or 4 bytes per character. It’s widely used in many programming languages (like Java).
    - UTF-32: Uses 4 bytes for every character, regardless of the size of the code point. It's simpler but less space-efficient.

   3. Unicode Characters: 
      - Unicode supports characters from various scripts (Latin, Arabic, Chinese, etc.), symbols, emojis, and even ancient languages.

   4. Surrogate Pairs: 
      - Some characters (e.g., certain emojis) require more than 16 bits in UTF-16, and are represented using surrogate pairs, a combination of two 16-bit code units. 
    -----------------------------------------------------------------------------------------------------------------------------------------------------------------
    Q. Why is Unicode Important?

     - Globalization: Supports almost every language, making it possible to represent text across different languages and cultures.
     - Consistency: Avoids issues like "mojibake" (garbled text) when transferring text between systems.
     - Compatibility: Widely used by modern systems, browsers, and programming languages to handle and display text reliably.
     NOTE:
     ### Before Unicode, there were multiple standards to represent character encoding −

            ASCII − for the United States.

            ISO 8859-1 − for Western European Language.

            KOI-8 − for Russian.

            GB18030 and BIG-5 − for Chinese.
 */

public class JavaUnicodeSystem {
    public static void main(String[] args) {
        char unicodeCharacter = '\u0041';
        System.out.println("Stored unicode character: " + unicodeCharacter);
    }
}
