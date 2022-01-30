package demo;

@FunctionalInterface
public interface Animal extends Dog{

	public void m1();
	
	boolean equals(Object obj);
	
	String toString();
}
