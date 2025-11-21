package assignment;

import com.test.mavenproject1.p1.Read;

public class Matrix {
	int m1[][];
	public Matrix() {
		m1=new int[3][3];
	}
	public Matrix(int row, int col) {
		m1=new int[row][col];
	}
	public Matrix(Matrix ob) {
		this.m1=ob.m1;
	}
	public void readMatrix() {
		System.out.println("Enter matrix of "+m1.length+" x "+m1[0].length);
		for(int i=0; i<m1.length; i++) {
			for(int j=0; j<m1[0].length; j++) {
				m1[i][j]=Read.sc.nextInt();
			}
		}
	}
	public void displayMatrix() {
		for(int i=0; i<m1.length; i++) {
			for(int j=0; j<m1[0].length; j++) {
				System.out.print(m1[i][j]);
			}
			System.out.println();
		}
	}
	public Matrix add(Matrix ob) {
		Matrix temp=new Matrix(m1.length, m1[0].length);
		for(int i=0; i<m1.length; i++) {
			for(int j=0; j<m1[0].length; j++) {
				temp.m1[i][j]=this.m1[i][j]+ob.m1[i][j];
			}
		}
		return temp;
	}
}
