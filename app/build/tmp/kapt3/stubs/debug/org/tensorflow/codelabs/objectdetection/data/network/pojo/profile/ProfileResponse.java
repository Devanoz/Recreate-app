package org.tensorflow.codelabs.objectdetection.data.network.pojo.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b%\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\bH\u00c6\u0003J\t\u0010)\u001a\u00020\nH\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J}\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010/\u001a\u00020\u00052\b\u00100\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00101\u001a\u00020\nH\u00d6\u0001J\t\u00102\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014\u00a8\u00063"}, d2 = {"Lorg/tensorflow/codelabs/objectdetection/data/network/pojo/profile/ProfileResponse;", "", "createdAt", "", "blocked", "", "provider", "name", "Lorg/tensorflow/codelabs/objectdetection/data/network/pojo/profile/Name;", "id", "", "avatar", "confirmed", "recommendations", "", "email", "username", "updatedAt", "(Ljava/lang/String;ZLjava/lang/String;Lorg/tensorflow/codelabs/objectdetection/data/network/pojo/profile/Name;ILjava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvatar", "()Ljava/lang/String;", "getBlocked", "()Z", "getConfirmed", "getCreatedAt", "getEmail", "getId", "()I", "getName", "()Lorg/tensorflow/codelabs/objectdetection/data/network/pojo/profile/Name;", "getProvider", "getRecommendations", "()Ljava/util/List;", "getUpdatedAt", "getUsername", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class ProfileResponse {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String createdAt = null;
    private final boolean blocked = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String provider = null;
    @org.jetbrains.annotations.NotNull()
    private final org.tensorflow.codelabs.objectdetection.data.network.pojo.profile.Name name = null;
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String avatar = null;
    private final boolean confirmed = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> recommendations = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String email = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String username = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String updatedAt = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.tensorflow.codelabs.objectdetection.data.network.pojo.profile.ProfileResponse copy(@org.jetbrains.annotations.NotNull()
    java.lang.String createdAt, boolean blocked, @org.jetbrains.annotations.NotNull()
    java.lang.String provider, @org.jetbrains.annotations.NotNull()
    org.tensorflow.codelabs.objectdetection.data.network.pojo.profile.Name name, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String avatar, boolean confirmed, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> recommendations, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
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
    
    public ProfileResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String createdAt, boolean blocked, @org.jetbrains.annotations.NotNull()
    java.lang.String provider, @org.jetbrains.annotations.NotNull()
    org.tensorflow.codelabs.objectdetection.data.network.pojo.profile.Name name, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String avatar, boolean confirmed, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> recommendations, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String updatedAt) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreatedAt() {
        return null;
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean getBlocked() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.tensorflow.codelabs.objectdetection.data.network.pojo.profile.Name component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.tensorflow.codelabs.objectdetection.data.network.pojo.profile.Name getName() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAvatar() {
        return null;
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final boolean getConfirmed() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getRecommendations() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUsername() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUpdatedAt() {
        return null;
    }
}