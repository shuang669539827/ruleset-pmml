package com;

import cn.hutool.core.io.FastByteArrayOutputStream;
import cn.hutool.core.io.IoUtil;
import org.dmg.pmml.PMML;
import org.dmg.pmml.PMMLObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @Author shuangj
 * @Description: PmmlConvertJson
 * Date: 2019-12-02-6:17 下午
 */
public class PmmlConvertJson {
    public static void main(String[] args) throws FileNotFoundException {
        PMML pmml = new PMML();
//        FileInputStream fileInputStream = new FileInputStream(new File("/Users/jack/Documents/ideaWorkspace/ruleset-pmml/src/main/antlr4/model_20372.pmml"));
        String s = IoUtil.read(new FileInputStream("/Users/jack/Documents/ideaWorkspace/ruleset-pmml/src/main/antlr4/model_20372.pmml")).toString();
        System.out.println(s);
    }
}
