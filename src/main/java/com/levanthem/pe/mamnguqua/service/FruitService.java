package com.levanthem.pe.mamnguqua.service;


import com.levanthem.pe.mamnguqua.entity.Fruit;
import com.levanthem.pe.mamnguqua.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitService {

    @Autowired
    private FruitRepository fruitRepo;

    //phục vụ cho việc show toàn bộ sách trong trang books.html
    public List<Fruit> getAllFruits() {

        //return bookRepo.findAll(); //hàm tự sinh
        return fruitRepo.findAll();
    }

    //phuc vụ cho nút save Book khi tạo mới, và edit
    //xài chung hàm: JPA nó check id nếu là mới thì là insert
    //                                      cũ thì là update
    public void saveFruit(Fruit o) {

        fruitRepo.save(o); //hàm tự sinh
    }

    //edit 1 Book, ta phải get đc Book này và đẩy sang model của book-form
    public Fruit getFruitById(Integer id) {

        return fruitRepo.findById(id).get();
    }                     //hàm tự sinh

    //link xoá Book
    public void deleteFruit(Fruit o) {
        fruitRepo.delete(o); //hàm tự sinh
    }

    public void deleteFruit(Integer id) {
        fruitRepo.deleteById(id); //hàm tự sinh
    }

    //search...
    public List<Fruit> searchFruitByName(String keyword) {

        return fruitRepo.searchAllByNameContainingIgnoreCase(keyword, keyword);
    }

    //HÀM KHÁC... KIỂM TRA SỰ TỒN TẠI CỦA 1 ROW BOOK THEO ID
    //            THAY VÌ TÌM 1 DÒNG, TRẢ RA NULL HAY DÒNG TÌM THẤY
    public boolean existsFruit(Integer id) {
        return fruitRepo.existsById(id);
    }                   //hàm tự sinh của JPA Repo

}
