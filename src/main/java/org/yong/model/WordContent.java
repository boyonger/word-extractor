package org.yong.model;

import java.util.List;

import lombok.Data;

@Data
public class WordContent {

    /**
     * text包括段落文字(不包括表格文字,改成包括表格文字也很简单)
     */
    private String text;

    /**
     * 抽取的表格对象
     */
    private List<WordTable> wordTableList;
}
