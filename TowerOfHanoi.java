public class TowerOfHanoi {

    static void TOH(int num, char src, char temp, char dst) {
        if (num == 0)
            return;

        TOH(num - 1, src, temp, dst);
        System.out.println("Move disk " + num + " from peg" + src + "to peg " + dst);
        TOH(num - 1, temp, dst, src);
    }
}