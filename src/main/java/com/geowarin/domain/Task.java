package com.geowarin.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Date: 05/03/2014
 * Time: 22:14
 *
 * @author Geoffroy Warin (http://geowarin.github.io)
 */
@XmlRootElement
@Data
@NoArgsConstructor
//@Builder
@RequiredArgsConstructor
public class Task {
    @NonNull
    private String authorLogin;
    private String taskId;
    private String taskName;
    private String initialCode;
    private int initialOffset;
    private String targetCode;
    private String hint;
}
