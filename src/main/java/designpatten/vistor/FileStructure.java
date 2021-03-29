package designpatten.vistor;

import java.io.File;

public class FileStructure {

    private File  filePath;

    public FileStructure(File  filePath) {
        this.filePath = filePath;
    }

    void handle(Visitor visitor){
        scan(this.filePath,visitor);
    }

    private void scan(File file, Visitor visitor) {
        if (file.isDirectory()) {
            // 让访问者处理文件夹:
            visitor.visitDir(file);
            for (File sub : file.listFiles()) {
                // 递归处理子文件夹:
                scan(sub, visitor);
            }
        } else if (file.isFile()) {
            // 让访问者处理文件:
            visitor.visitFile(file);
        }
    }
}
