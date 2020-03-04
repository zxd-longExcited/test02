package com.test.mybatis01.bean;

import java.util.Date;

public class Content {
    private int id;
    private int siteId;
    private String title;
    private int userId;
    private int checkUserId;
    private int categoryId;
    private int modelId;
    private int parentId;
    private int quoteContentId;
    private boolean copied;
    private String author;
    private String editor;
    private String onlyUrl;
    private boolean hasImages;
    private boolean hasFiles;
    private boolean hasStatic;
    private String url;
    private String description;
    private String tagIds;
    private String dictionaryValues;
    private String cover;
    private int childs;
    private double scores;
    private int comments;
    private int clicks;
    private Date publishDate;
    private Date expireDate;
    private Date checkDate;
    private Date updateDate;
    private Date createDate;
    private int sort;
    private int status;
    private boolean disabled;

    private int contentId;
    private String source;
    private String sourceUrl;
    private String data;
    private String searchText;
    private String text;
    private int wordCount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSiteId() {
        return siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCheckUserId() {
        return checkUserId;
    }

    public void setCheckUserId(int checkUserId) {
        this.checkUserId = checkUserId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getModelId() {
        return modelId;
    }

    public void setModelId(int modelId) {
        this.modelId = modelId;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getQuoteContentId() {
        return quoteContentId;
    }

    public void setQuoteContentId(int quoteContentId) {
        this.quoteContentId = quoteContentId;
    }

    public boolean isCopied() {
        return copied;
    }

    public void setCopied(boolean copied) {
        this.copied = copied;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getOnlyUrl() {
        return onlyUrl;
    }

    public void setOnlyUrl(String onlyUrl) {
        this.onlyUrl = onlyUrl;
    }

    public boolean isHasImages() {
        return hasImages;
    }

    public void setHasImages(boolean hasImages) {
        this.hasImages = hasImages;
    }

    public boolean isHasFiles() {
        return hasFiles;
    }

    public void setHasFiles(boolean hasFiles) {
        this.hasFiles = hasFiles;
    }

    public boolean isHasStatic() {
        return hasStatic;
    }

    public void setHasStatic(boolean hasStatic) {
        this.hasStatic = hasStatic;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTagIds() {
        return tagIds;
    }

    public void setTagIds(String tagIds) {
        this.tagIds = tagIds;
    }

    public String getDictionaryValues() {
        return dictionaryValues;
    }

    public void setDictionaryValues(String dictionaryValues) {
        this.dictionaryValues = dictionaryValues;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public int getChilds() {
        return childs;
    }

    public void setChilds(int childs) {
        this.childs = childs;
    }

    public double getScores() {
        return scores;
    }

    public void setScores(double scores) {
        this.scores = scores;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public int getClicks() {
        return clicks;
    }

    public void setClicks(int clicks) {
        this.clicks = clicks;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public Date getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public int getContentId() {
        return contentId;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    @Override
    public String toString() {
        return "Content{" +
                "id=" + id +
                ", siteId=" + siteId +
                ", title='" + title + '\'' +
                ", userId=" + userId +
                ", checkUserId=" + checkUserId +
                ", categoryId=" + categoryId +
                ", modelId=" + modelId +
                ", parentId=" + parentId +
                ", quoteContentId=" + quoteContentId +
                ", copied=" + copied +
                ", author='" + author + '\'' +
                ", editor='" + editor + '\'' +
                ", onlyUrl='" + onlyUrl + '\'' +
                ", hasImages=" + hasImages +
                ", hasFiles=" + hasFiles +
                ", hasStatic=" + hasStatic +
                ", url='" + url + '\'' +
                ", description='" + description + '\'' +
                ", tagIds='" + tagIds + '\'' +
                ", dictionaryValues='" + dictionaryValues + '\'' +
                ", cover='" + cover + '\'' +
                ", childs=" + childs +
                ", scores=" + scores +
                ", comments=" + comments +
                ", clicks=" + clicks +
                ", publishDate=" + publishDate +
                ", expireDate=" + expireDate +
                ", checkDate=" + checkDate +
                ", updateDate=" + updateDate +
                ", createDate=" + createDate +
                ", sort=" + sort +
                ", status=" + status +
                ", disabled=" + disabled +
                ", contentId=" + contentId +
                ", source='" + source + '\'' +
                ", sourceUrl='" + sourceUrl + '\'' +
                ", data='" + data + '\'' +
                ", searchText='" + searchText + '\'' +
                ", text='" + text + '\'' +
                ", wordCount=" + wordCount +
                '}';
    }
}
