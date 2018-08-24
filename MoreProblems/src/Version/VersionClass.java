package Version;

/**
 *
 * Compare two version numbers version1 and version2.
 * If version1 > version2 return 1; if version1 < version2 return -1;otherwise return 0.
 *
 * You may assume that the version strings are non-empty and contain only digits and the . character.
 * The . character does not represent a decimal point and is used to separate number sequences.
 * For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.
 *
 * Example 1:
 *
 * Input: version1 = "0.1", version2 = "1.1"
 * Output: -1
 * Example 2:
 *
 * Input: version1 = "1.0.1", version2 = "1"
 * Output: 1
 * Example 3:
 *
 * Input: version1 = "7.5.2.4", version2 = "7.5.3"
 * Output: -1*/


public class VersionClass {
    public int versionCompare(String v1, String v2) {

        String[] s1 = v1.split("\\.");
        String[] s2 = v2.split("\\.");

        int maxLen = s1.length < s2.length ? s2.length : s1.length;
        for(int i=0;i<maxLen;i++){
            int x = i<s1.length ? Integer.valueOf(s1[i]) : 0;
            int y = i<s2.length ? Integer.valueOf(s2[i]) : 0;

            if(x<y){
                return -1;
            }
            else if(x>y){
                return 1;
            }

        }


    return 0;

    }
}
