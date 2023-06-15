package org.tensorflow.codelabs.objectdetection.data.network.pojo.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0012J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u000b\u0010-\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u000b\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0092\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u00102J\u0013\u00103\u001a\u00020\u00052\b\u00104\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00105\u001a\u00020\tH\u00d6\u0001J\t\u00106\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001a\u00a8\u00067"}, d2 = {"Lorg/tensorflow/codelabs/objectdetection/data/network/pojo/profile/ProfileResponse;", "", "createdAt", "", "blocked", "", "provider", "name", "id", "", "avatar", "Lorg/tensorflow/codelabs/objectdetection/data/network/pojo/profile/Avatar;", "history", "Lorg/tensorflow/codelabs/objectdetection/data/network/pojo/profile/History;", "confirmed", "email", "username", "updatedAt", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;Lorg/tensorflow/codelabs/objectdetection/data/network/pojo/profile/Avatar;Lorg/tensorflow/codelabs/objectdetection/data/network/pojo/profile/History;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvatar", "()Lorg/tensorflow/codelabs/objectdetection/data/network/pojo/profile/Avatar;", "getBlocked", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getConfirmed", "getCreatedAt", "()Ljava/lang/String;", "getEmail", "getHistory", "()Lorg/tensorflow/codelabs/objectdetection/data/network/pojo/profile/History;", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "()Ljava/lang/Object;", "getProvider", "getUpdatedAt", "getUsername", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;Lorg/tensorflow/codelabs/objectdetection/data/network/pojo/profile/Avatar;Lorg/tensorflow/codelabs/objectdetection/data/network/pojo/profile/History;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/tensorflow/codelabs/objectdetection/data/network/pojo/profile/ProfileResponse;", "equals", "other", "hashCode", "toString", "app_debug"})
public final class ProfileResponse {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String createdAt = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean blocked = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String provider = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object name = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer id = null;
    @org.jetbrains.annotations.Nullable()
    private final org.tensorflow.codelabs.objectdetection.data.network.pojo.profile.Avatar avatar = null;
    @org.jetbrains.annotations.Nullable()
    private final org.tensorflow.codelabs.objectdetection.data.network.pojo.profile.History history = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean confirmed = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String email = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String username = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String updatedAt = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.tensorflow.codelabs.objectdetection.data.network.pojo.profile.ProfileResponse copy(@org.jetbrains.annotations.Nullable()
    java.lang.String createdAt, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean blocked, @org.jetbrains.annotations.Nullable()
    java.lang.String provider, @org.jetbrains.annotations.Nullable()
    java.lang.Object name, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    org.tensorflow.codelabs.objectdetection.data.network.pojo.profile.Avatar avatar, @org.jetbrains.annotations.Nullable()
    org.tensorflow.codelabs.objectdetection.data.network.pojo.profile.History history, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean confirmed, @org.jetbrains.annotations.Nullable()
    java.lang.String email, @org.jetbrains.annotations.Nullable()
    java.lang.String username, @org.jetbrains.annotations.Nullable()
    java.lang.String updatedAt) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ProfileResponse() {
        super();
    }
    
    public ProfileResponse(@org.jetbrains.annotations.Nullable()
    java.lang.String createdAt, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean blocked, @org.jetbrains.annotations.Nullable()
    java.lang.String provider, @org.jetbrains.annotations.Nullable()
    java.lang.Object name, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    org.tensorflow.codelabs.objectdetection.data.network.pojo.profile.Avatar avatar, @org.jetbrains.annotations.Nullable()
    org.tensorflow.codelabs.objectdetection.data.network.pojo.profile.History history, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean confirmed, @org.jetbrains.annotations.Nullable()
    java.lang.String email, @org.jetbrains.annotations.Nullable()
    java.lang.String username, @org.jetbrains.annotations.Nullable()
    java.lang.String updatedAt) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCreatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getBlocked() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.tensorflow.codelabs.objectdetection.data.network.pojo.profile.Avatar component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.tensorflow.codelabs.objectdetection.data.network.pojo.profile.Avatar getAvatar() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.tensorflow.codelabs.objectdetection.data.network.pojo.profile.History component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.tensorflow.codelabs.objectdetection.data.network.pojo.profile.History getHistory() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getConfirmed() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUsername() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUpdatedAt() {
        return null;
    }
}