package com.mexc.merkle.model;

import java.util.List;

/**
 * 默克尔树路径
 */
public class MerkleTree {
    /**
     * 自身节点
     */
    private MerkleSelfNode self;
    /**
     * 路径节点
     */
    private List<MerklePathNode> pathList;

    public MerkleSelfNode getSelf() {
        return self;
    }

    public void setSelf(MerkleSelfNode self) {
        this.self = self;
    }

    public List<MerklePathNode> getPathList() {
        return pathList;
    }

    public void setPathList(List<MerklePathNode> pathList) {
        this.pathList = pathList;
    }
}
