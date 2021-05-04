package odev4_3.core.dal.concrete;

import odev4_3.core.dal.abstracts.IBaseDal;

public class BaseDal<T> implements IBaseDal<T> {

	@Override
	public final void add(T t) {
		System.out.println("Kay�t veritaban�na eklendi " + t.getClass().getName());
	}

	@Override
	public final void update(T t) {
		System.out.println("Kay�t g�ncellendi " + t.getClass().getName());
	}

	@Override
	public final void delete(T t) {
		System.out.println("Kay�t veritaban�ndan silindi " + t.getClass().getName());
	}

}
