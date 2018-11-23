package pattern.structural.composite;

import java.util.List;

/**
 * @author 七夜雪
 * @create 2018-11-23 19:44
 */
public abstract class FileComponent {

    public void addFile(FileComponent file){
        throw new UnsupportedOperationException("不支持新增文件操作");
    }

    public void removeFile(FileComponent file){
        throw new UnsupportedOperationException("不支持删除文件操作");
    }

    public int getSize(){
        throw new UnsupportedOperationException("不支持获取文件列表操作");
    }

    public String getName(){
        throw new UnsupportedOperationException("不支持获取文件名称操作");
    }

    // 打印文件列表或者文件名称
    public void print(){
        throw new UnsupportedOperationException("不支持打印文件操作");
    }

    public List<FileComponent> getFileList(){
        throw new UnsupportedOperationException("不支持获取文件列表操作");
    }

}
