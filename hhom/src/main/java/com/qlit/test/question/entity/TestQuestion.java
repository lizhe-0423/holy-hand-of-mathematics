package com.qlit.test.question.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 测试题库
 * </p>
 *
 * @author 荔枝
 * @since 2023-03-03
 */
@TableName("test_question")
@ApiModel(value = "TestQuestion对象", description = "测试题库")
public class TestQuestion implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("题目题号")
    @TableId(value = "question_id", type = IdType.AUTO)
    private Integer questionId;

    @ApiModelProperty("题目类型")
    private String questionType;

    @ApiModelProperty("题目内容")
    private String questionContent;

    @ApiModelProperty("题目答案")
    private String questionAnswer;

    @ApiModelProperty("题目分数")
    private Integer questionValue;

    @ApiModelProperty("题目积分")
    private Integer questIntegral;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty("是否删除(0-未删, 1-已删)")
    private Integer isDeleted;

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }
    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }
    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }
    public String getQuestionAnswer() {
        return questionAnswer;
    }

    public void setQuestionAnswer(String questionAnswer) {
        this.questionAnswer = questionAnswer;
    }
    public Integer getQuestionValue() {
        return questionValue;
    }

    public void setQuestionValue(Integer questionValue) {
        this.questionValue = questionValue;
    }
    public Integer getQuestIntegral() {
        return questIntegral;
    }

    public void setQuestIntegral(Integer questIntegral) {
        this.questIntegral = questIntegral;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "TestQuestion{" +
            "questionId=" + questionId +
            ", questionType=" + questionType +
            ", questionContent=" + questionContent +
            ", questionAnswer=" + questionAnswer +
            ", questionValue=" + questionValue +
            ", questIntegral=" + questIntegral +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
            ", isDeleted=" + isDeleted +
        "}";
    }
}
