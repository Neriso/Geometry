public class NotYetImplementedException extends RuntimeException {

    @Override
    public String getMessage(){

        return "Parameter cannot be less than or equal to zero.";
    }

    /**
     *
     */
    private static final long serialVersionUID = 1L;



}