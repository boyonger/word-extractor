package org.yong.service;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;

import org.yong.model.WordContent;

public interface WordExtractorService {

    WordContent adaptDocxToPdfTable(File file) throws IOException;

    WordContent adaptDocToPdfTable(File file) throws IOException;

    WordContent adaptDocxToPdfTable(BufferedInputStream in) throws IOException;

    WordContent adaptDocToPdfTable(BufferedInputStream in) throws IOException;
    
}
