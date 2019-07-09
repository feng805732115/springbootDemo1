package com.springboot.springbootDemo.config;
public class AlipayConfig {
    // 商户appid
    public static String APPID = "2016092600603239";
    // 私钥 pkcs8格式的
    public static String RSA_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQC1MXYXxBYoSAyTprbINQ/8+uBtClufR1UVMXYnKWeLwdEFcwjZME6JU+Ptaps4clR7xWHRT2CI1+sD6CW+JS29wn0dcqCCsUs+OsrSpIqSEN6nDTfVZ7aqffOkYwvu4GDipGq00cmHvlgy1zjIVvrWs2KpjEjOwquUS3hnJwnzy8HGrpP2YlonMa4J6Bly9RgvAq9QkycG+GCgKgDlko4sKZN3A2eNYqpSb/ClD23ICHiNEtn67DNsuRCSLosV/xvIKv47SHFlD6tzkokTfVhecbU7mA7mwPPJoRTmxpOxnXhCLmzEyBzcJAJb7tNQpkQYj3/PtZdPAO0/udsyAuGFAgMBAAECggEAX/yJ0OFB06kHcJiar8jcZWoJxfn8u44wVn/TVb+raPAN6NMd1uCuWjWkwzr8a5S1iLPxs85XF2c6yuEKTYaoiqQjX5w/x7xgXeELXTdpaSOir+BiuZytuffrQCRwR+V5rdbn6E5ScqS1WImHPSpGy8JP+/2i/FVIS9EHQa3+qbVdC0mumuVBf0lJOzwzOMm+4IBnrQvStAHjqrC48wgcvbwnFhCbmH6wzPd37HTvtHTsb8uc4ELN7Xu8E6M2erv8vi2ndxcUfBBI1tqHXQxe/iX5kzvVWSnCGHsA4MRiTUBlYtQpCLndK0h4ZIERA4nN2twPhAz6Q3Rf0HPqPZbDgQKBgQDX8AGOSHcnbO9GSYz5D3E0iFLegPs6L58zYlnsBc+ZCn5mjQcwfYEXtB3T0OYapQWMNv152q4+ERK4xgrdxt1fHtssplJnCiL5sh85hkc0Cjv0zhs/o3JVJtXKqA+uokZX+p/AYA8Q5dK2JC2O6pNWVQwHEmjilncQdVLU9Zs10QKBgQDWz0RvOOJrqcuny6RURwurxXwQ1VlAJoXRyeF05WquazyfeFvavDeR6cBuaXFk4eHeIRS8hPCIgWBIBbfqu34AISVsLF5aFf1WZuQvicM3FXPibR+K9dxCVIlM15sparH+rQmYDN2x3KUf0ioFfyNzSB9sLIGO64uIyIvX7sv5dQKBgC5DfIHYYrburuD3Nx3RQibIIkELj0erFkezBaL8p7qZNfWQt36bFQJYE5/i/Lmuq16cFXh68qPXkpRF0eQsDBeqC7koNTVgRZgLoob3jt/GZYwQcGQVB5TYyisuEJYQrFODHaDgs7miE5/0ZlJdTY3MkNQfDJunMwEysblwmX1RAoGAH3I0OHwBWXV/5M6A/f1wjfLZGLXC3QtGp9F/+dbj6Si1tTqvZ7QKBohLrV4uRXBz2krJeFeVxsX5zFFZ/Tj5VxeDHPTZ0yJI9e8WFId8VoIDdvA2n+ciGWu6tc8SXdvKtteqAeJQSgtc+O2RTUCxddznDLTvOnbs9Fc3caL5pUkCgYEAlOUdxF8MYLejJUGtg8qNKG33CMqEcyqRbxdSwBqPW9lT8++Z9QoK9CuRC4JfgkNG0v3f6p0un/itnTO4ichWHPgVUMEnIQZXlIUOAA50dk5rNR/TPj6+vqNWL9z26WovUr8SubjPqx01Qh0G6lw1lXyXqawQoPggDcu1fenxRDo=";
    // 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://127.0.0.1:8080/AlipayAndWx/notify_url.jsp";
    // 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
    public static String return_url = "http://127.0.0.1:8080/AlipayAndWx/return_url.jsp";
    // 请求网关地址
    public static String URL = "https://openapi.alipaydev.com/gateway.do";
    // 编码
    public static String CHARSET = "UTF-8";
    // 返回格式
    public static String FORMAT = "json";
    // 支付宝公钥
    public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxu4fljhDynhhlUzOceE+LbRaO+IGlCcG4/l6aklxqaqoE4cZlWJX5jxFu7ZH727SUt1epX/vYtMMsFnrzDDAkDdet3vQUDxJqAbn45uNn8gzb+wKj0WtIiVPkYs/QOHNqQRD6r7HBewU9Nt9FR0gFfpJZS1xbCgeEnH/yB74+hSz4E5EvZHEJT8qu//y7vE2+0xsAzhfgq9XIrI13xIgCyQS8apTaVpllfgK04bFWDhbNOKcgR3KuanPciQgk0mnj6Sua4r47EWAuz9VHO4zVZzx9YpYJJ+/Uw8D808ftDc7xPRAonjQbFLs+xETg1UPwZ27NRcUdexLKjdkyWCRWQIDAQAB";
    // 日志记录目录
    public static String log_path = "/log";
    // RSA2
    public static String SIGNTYPE = "RSA2";
}
