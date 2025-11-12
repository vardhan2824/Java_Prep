class Exception{
	public static void main(String args[]){
		try{
			throw new ArithmeticException("Arithmetic Exception is raised");
		}
		catch(Exception e){
			System.err.println(e.getMessage());
		}
		finally{
			System.out.println("Finally Block");
		}
	}
}