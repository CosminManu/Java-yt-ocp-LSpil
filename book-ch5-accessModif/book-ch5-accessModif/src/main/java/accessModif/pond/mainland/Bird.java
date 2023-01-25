package accessModif.pond.mainland;

public class Bird {
	
	String name = "Coco";					// level of access = package
	protected String ability = "floating";	//lvl access = protected
	protected void floatInWater(){
		System.out.println(ability);	
	}
	
	//protected = same package +(or) extends
	public boolean pub = true;
	
	
//	void notAllowed(){		Access modif not allowed inside of methods
//		private int x;
//		protected String m;
//		public boolean n;
//	}
	
}
