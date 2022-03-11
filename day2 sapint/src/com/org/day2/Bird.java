package com.org.day2;

public abstract class Bird {
	public void show() {
		System.out.println("Bird is flaying");
	}

	public class Parat extends Bird {

		public void show() {
			System.out.println("Parat is flaying");
		}
	}
		public class Eagle extends Parat {

			public void show() {
				System.out.println("Egale is flaying");
			}
		}
			public class Duck extends Eagle {

				public void show() {
					System.out.println("Duck is flaying");
				}
			}

	public static void main(String[] args) {
		Duck b = new Duck();
		b.show();

	}
			}
		
	
	


