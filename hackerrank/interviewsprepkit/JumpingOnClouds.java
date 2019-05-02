public class JumpingOnClouds {

    public static void main(String[] args) {
        int [] c = {0, 0, 1, 0, 0, 1, 0};
        System.out.println(jumpingOnClouds(c));
    }

    static int jumpingOnClouds(int[] c) {
        int jumps = 0;
        for (int i = 0; i < c.length;) {
            if (i + 1 < c.length) {
                if (i + 2 < c.length) {
                    if (c[i + 2] != 1) {
                        jumps++;
                        i+=2;
                        continue;
                    } else {
                        if (c[i + 1] != 1) {
                            jumps++;
                            i++;
                            continue;
                        }
                    }
                }
                if (c[i + 1] != 1) {
                    jumps++;
                    i++;
                }
            } else {
                i++;
            }
        }
        return jumps;
    }
}
