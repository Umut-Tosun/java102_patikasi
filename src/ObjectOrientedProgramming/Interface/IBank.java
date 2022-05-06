package ObjectOrientedProgramming.Interface;

public interface IBank {
    final String hostIpAddress= "127.8.0.9";
    boolean connect(String ipAddress);
    boolean payment(double price,String cardNo,String expiryDate,String cvc);
}
