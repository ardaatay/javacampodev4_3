package odev4_3.core.dal.abstracts;

public interface IBaseDal<T> {
	void add(T t);

	void update(T t);

	void delete(T t);
}
