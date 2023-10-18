package one.digitalinnovation.gof.singleton;

public class SingletonLazyHolder {
	
	private static class InstaceHolder{
	private static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	private SingletonLazyHolder() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static SingletonLazyHolder getInstancia(){
		
		return InstaceHolder.instancia;
	}
	
	
}
