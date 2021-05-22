package kodlamaio.northwind.core.utilities.results;

public class Result {
   private boolean success;
   private String message;
   
   public Result(boolean success) {
	   this.success = success;
   }
   
   public Result(boolean success,String message) {
	   this(success);
	   this.message = message;
   }
   
   public boolean isSuccess() {
	   return this.success;
   }
   
   public String getMessage() {
	   return this.message;
   }
}
