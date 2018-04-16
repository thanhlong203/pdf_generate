package vn.yume.cv.orm.dao;

import java.io.Serializable;

public interface Dao<T> {
	T get(Serializable id);
}
