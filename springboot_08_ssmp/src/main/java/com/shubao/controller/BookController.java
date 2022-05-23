package com.shubao.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.shubao.domain.Book;
import com.shubao.service.IBookService;
import com.shubao.utils.ResultVOUtil;
import com.shubao.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @version 1.0
 * @program: SpringBoot2022
 * @description: BookController类
 * @author: chris
 * @create: 2022-05-16 11:15
 * @since JDK1.8
 **/
// @Controller + @ResponseBody = @RestController
@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private IBookService bookService;

    /**
     * 查询所有图书
     * @return
     */
    @GetMapping
    public ResultVO<Book> getAll(){
        return ResultVOUtil.success(bookService.list());
    }

    /**
     * 根据id查询图书
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public ResultVO getById(@PathVariable("id") Integer id){
        Book book = bookService.getById(id);
        if (book == null){
            return ResultVOUtil.error(404, "查询失败");
        }
        return ResultVOUtil.success("查询成功", book);
    }

    // /**
    //  * 分页查询
    //  * @param currentPage
    //  * @param pageSize
    //  * @return
    //  */
    // @GetMapping("/{currentPage}/{pageSize}")
    // public ResultVO getPage(@PathVariable int currentPage, @PathVariable int pageSize){
    //     IPage<Book> books = bookService.findByPage(currentPage, pageSize);
    //     // 如果当前页码值大于总页码值，那么重新执行查询操作，设置当前页码值为总页码值
    //     if (currentPage > books.getPages()){
    //         books = bookService.findByPage((int) books.getPages(), pageSize);
    //     }
    //     return ResultVOUtil.success(books);
    // }

    /**
     * 分页查询
     * @param currentPage
     * @param pageSize
     * @return
     */
    @GetMapping("/{currentPage}/{pageSize}")
    public ResultVO getPage(@PathVariable int currentPage, @PathVariable int pageSize, Book book){
        IPage<Book> books = bookService.findByPage(currentPage, pageSize, book);
        // 如果当前页码值大于总页码值，那么重新执行查询操作，设置当前页码值为总页码值
        if (currentPage > books.getPages()){
            books = bookService.findByPage((int) books.getPages(), pageSize, book);
        }
        return ResultVOUtil.success(books);
    }

    /**
     * 新增图书
     * @param book
     * @return
     */
    @PostMapping
    public ResultVO add(@RequestBody Book book){
        bookService.save(book);
        return ResultVOUtil.success("新增成功");
    }

    /**
     * 更新图书
     * @param book
     * @return
     */
    @PutMapping
    public ResultVO update(@RequestBody Book book){
        bookService.updateById(book);
        return ResultVOUtil.success("更新成功");
    }

    /**
     * 删除图书
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public ResultVO delete(@PathVariable("id") Integer id){
        bookService.removeById(id);
        return ResultVOUtil.success("删除成功");
    }
}
