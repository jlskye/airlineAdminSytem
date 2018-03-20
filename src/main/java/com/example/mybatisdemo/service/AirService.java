package com.example.mybatisdemo.service;

        import com.example.mybatisdemo.entity.Air;

        import java.util.List;

public interface AirService {
    List<Air> findAll();
    void insert(Air client);
    void deleteById(int id);
    void updateById(Air air);

}

