/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package punchcardrecords.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 工具包
 * @author qiuyu
 */
public class PropertyUtils {
    /**
     * 初始化属性配置文件
     * @return 返回属性配置文件
     */
    private static Properties instance(){
        Properties propertis = new Properties();
        InputStream in = PropertyUtils.class.getResourceAsStream("/resources/properties/properties.properties");
        try {
            propertis.load(in);
        } catch (IOException ex) {
            Logger.getLogger(PropertyUtils.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return propertis;
    }
    /**
     * 获取配置文件的属性值
     * @param key 属性
     * @return 属性值
     */
    public static String getProperty(String key){
        return null!=PropertyUtils.instance()?PropertyUtils.instance().getProperty(key).trim():null;
    }
    
    /**
     * 返回版本信息
     * @return 
     */
    public static SoftVersion instanceVersion(){
        return new SoftVersion(PropertyUtils.getProperty("soft_name"), PropertyUtils.getProperty("version"),PropertyUtils.getProperty("update"));
    }
}
