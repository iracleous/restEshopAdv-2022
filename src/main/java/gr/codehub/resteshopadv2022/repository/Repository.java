package gr.codehub.resteshopadv2022.repository;

import java.util.List;

public interface Repository<T> {
    int create(T t);
    T read(int i);
    List<T> read();
    void update(int i, T t);
    boolean delete(int i);
}
