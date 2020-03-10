// 使用分治算法
package Hanoi;

public class Hanoi {
	public static void main(String[] args) {
		Hanoi hanoi = new Hanoi();
		// 设定圆盘个数，将三根柱子记为a,b,c
		hanoi.hanoi(4, 'a', 'b', 'c');
	}
	// 定义圆盘移动方法
	public void move(char x, int n, char z) {
		System.out.println("移动圆盘"+n+" ,从"+x+"到"+z);
	}
	// 定义分治算法
	public void hanoi(int n, char x, char y, char z) {
		if (n == 1) {
			// 只有一个圆盘时，直接从x移动到z
			move(x, n, z);
		}
		else {
			// 有多个圆盘时，先将n-1个圆盘从x移动到y，以z作中转
			hanoi(n-1, x, z, y);
			// 将最大的圆盘从x移动到z
			move(x, n, z);
			// 再将剩下的n-1个圆盘从y移动到z，以x作中转
			hanoi(n-1, y, x, z);
		}
	}
}
