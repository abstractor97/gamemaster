package com.luckygames.wmxz.gamemaster.model.view.request;

public class ChannelSearchQuery extends KeywordSearchQuery {
    private Long channelId;

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public ChannelSearchQuery(KeywordSearchQuery request) {
        this.setKeyword(request.getKeyword());
        this.setPageNum(request.getPageNum());
        this.setPageSize(request.getPageSize());
        this.setOrderField(request.getOrderField());
        this.setOrderDirection(request.getOrderDirection());
    }

    public ChannelSearchQuery() {
    }

    public ChannelSearchQuery(String keyword) {
        super(keyword);
    }

    public ChannelSearchQuery(Integer pageNum, Integer pageSize, String orderField, String orderDirection, String keyword) {
        super(pageNum, pageSize, orderField, orderDirection, keyword);
    }
}
