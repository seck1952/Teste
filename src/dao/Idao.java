package dao;

import java.util.List;

public interface Idao<T> {
	public void add(T t);
	public void update(T t);
	public void delete(int val);
	public List<T> findAll(String val);

}
