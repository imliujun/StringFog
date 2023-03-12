package com.github.megatronking.stringfog.plugin;

import java.io.File;
import java.io.IOException;

/**
 * 项目名称：StringFog
 * 类描述：
 * 创建人：liujun
 * 创建时间：2023/3/11 23:12
 * 修改备注：
 */
public class FileUtils {
    static File mkdirs(File directory) throws IOException {
        if (directory != null && !directory.mkdirs() && !directory.isDirectory()) {
            throw new IOException("Cannot create directory '" + directory + "'.");
        } else {
            return directory;
        }
    }
}
