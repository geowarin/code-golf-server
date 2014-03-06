package com.geowarin.task;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Date: 05/03/2014
 * Time: 22:14
 *
 * @author Geoffroy Warin (http://geowarin.github.io)
 */
@Entity
@XmlRootElement
@Data
@NoArgsConstructor
//@Builder
@RequiredArgsConstructor
public class Task {
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    @Column(nullable = false)
    private String authorLogin;
    @Column
    private String taskId;
    @Column
    private String taskName;
    @Column
    private String initialCode;
    @Column(nullable = false)
    private int initialOffset;
    @Column
    private String targetCode;
    @Column
    private String hint;
}
