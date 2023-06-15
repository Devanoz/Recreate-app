package org.tensorflow.codelabs.objectdetection.data.network.pojo.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b1\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u00d1\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0016J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u000b\u00100\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u000b\u00102\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u000b\u00105\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00da\u0001\u0010>\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010?J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010C\u001a\u00020\u000fH\u00d6\u0001J\t\u0010D\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\n\n\u0002\u0010\"\u001a\u0004\b#\u0010!R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0018R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\n\n\u0002\u0010\"\u001a\u0004\b,\u0010!\u00a8\u0006E"}, d2 = {"Lorg/tensorflow/codelabs/objectdetection/data/network/pojo/profile/Avatar;", "", "ext", "", "formats", "Lorg/tensorflow/codelabs/objectdetection/data/network/pojo/profile/Formats;", "previewUrl", "mime", "caption", "url", "createdAt", "size", "provider", "name", "width", "", "providerMetadata", "id", "alternativeText", "hash", "height", "updatedAt", "(Ljava/lang/String;Lorg/tensorflow/codelabs/objectdetection/data/network/pojo/profile/Formats;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getAlternativeText", "()Ljava/lang/Object;", "getCaption", "getCreatedAt", "()Ljava/lang/String;", "getExt", "getFormats", "()Lorg/tensorflow/codelabs/objectdetection/data/network/pojo/profile/Formats;", "getHash", "getHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getId", "getMime", "getName", "getPreviewUrl", "getProvider", "getProviderMetadata", "getSize", "getUpdatedAt", "getUrl", "getWidth", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lorg/tensorflow/codelabs/objectdetection/data/network/pojo/profile/Formats;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lorg/tensorflow/codelabs/objectdetection/data/network/pojo/profile/Avatar;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Avatar {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String ext = null;
    @org.jetbrains.annotations.Nullable()
    private final org.tensorflow.codelabs.objectdetection.data.network.pojo.profile.Formats formats = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object previewUrl = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String mime = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object caption = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String url = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String createdAt = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object size = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String provider = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer width = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object providerMetadata = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object alternativeText = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String hash = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer height = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String updatedAt = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.tensorflow.codelabs.objectdetection.data.network.pojo.profile.Avatar copy(@org.jetbrains.annotations.Nullable()
    java.lang.String ext, @org.jetbrains.annotations.Nullable()
    org.tensorflow.codelabs.objectdetection.data.network.pojo.profile.Formats formats, @org.jetbrains.annotations.Nullable()
    java.lang.Object previewUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String mime, @org.jetbrains.annotations.Nullable()
    java.lang.Object caption, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.lang.String createdAt, @org.jetbrains.annotations.Nullable()
    java.lang.Object size, @org.jetbrains.annotations.Nullable()
    java.lang.String provider, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.Integer width, @org.jetbrains.annotations.Nullable()
    java.lang.Object providerMetadata, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.Object alternativeText, @org.jetbrains.annotations.Nullable()
    java.lang.String hash, @org.jetbrains.annotations.Nullable()
    java.lang.Integer height, @org.jetbrains.annotations.Nullable()
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
    
    public Avatar() {
        super();
    }
    
    public Avatar(@org.jetbrains.annotations.Nullable()
    java.lang.String ext, @org.jetbrains.annotations.Nullable()
    org.tensorflow.codelabs.objectdetection.data.network.pojo.profile.Formats formats, @org.jetbrains.annotations.Nullable()
    java.lang.Object previewUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String mime, @org.jetbrains.annotations.Nullable()
    java.lang.Object caption, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.lang.String createdAt, @org.jetbrains.annotations.Nullable()
    java.lang.Object size, @org.jetbrains.annotations.Nullable()
    java.lang.String provider, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.Integer width, @org.jetbrains.annotations.Nullable()
    java.lang.Object providerMetadata, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.Object alternativeText, @org.jetbrains.annotations.Nullable()
    java.lang.String hash, @org.jetbrains.annotations.Nullable()
    java.lang.Integer height, @org.jetbrains.annotations.Nullable()
    java.lang.String updatedAt) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getExt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.tensorflow.codelabs.objectdetection.data.network.pojo.profile.Formats component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.tensorflow.codelabs.objectdetection.data.network.pojo.profile.Formats getFormats() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPreviewUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCaption() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCreatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSize() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getWidth() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getProviderMetadata() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAlternativeText() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHash() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getHeight() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUpdatedAt() {
        return null;
    }
}