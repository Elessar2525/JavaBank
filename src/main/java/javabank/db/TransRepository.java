package javabank.db;

public interface TransRepository {
      boolean sourceExist(int accID);
      boolean targetExist(int accID);


}
