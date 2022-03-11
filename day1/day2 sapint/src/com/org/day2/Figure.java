package com.org.day2;

public abstract class Figure {
	protected int dim1;
	protected int dim2;

	public Figure(int dim1, int dim2) {
		this.dim1 = dim1;
		this.dim2 = dim2;
	}

	public Figure(int dim2) {
		this.dim2 = dim2;
	}

	public String getDetails() {
		return this.dim1 + " " + this.dim2;
	}

	abstract public double area();
}
public class Traingle extends Figure {

	int dim1;
	int dim2;
	double dim3 = 0.5;

	public Traingle(int dim1, int dim2) {
		super(dim1, dim2);
		this.dim1 = dim1;
		this.dim2 = dim2;
	}

	public double area() {
		return dim3 * dim1 * dim2;
	}

public class Rectangle extends Figure {
	int dim1;
	int dim2;

	public Rectangle(int dim1, int dim2) {
		super(dim1, dim2);
		this.dim1 = dim1;
		this.dim2 = dim2;

	}

	public double area() {
		return dim1 * dim2;
	}


	public static void main(String[] args) {
		Figure f = new Traingle(2, 2);

		System.out.println(f.area());


	
	}
}
}


