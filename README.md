# demosoa

初版主要用于尝试。
集成项包括 Spring boot + Mybatis + dubbo 
花时间比较多的就是解决一主多从的情况下，数据源切换的问题。项目结构已经出来了，后续补上 mybatis-generator 自动生成读写模块的代码。

该项目可作为公司项目 SOA 框架的 demo，后续不会涉及业务，只用于框架模板，以下几部分待完善。
1.dubbo client service + database model + enum + request param + request result 分离出来，独立出一个 API 模块，用于外部依赖。
2.服务层依赖 API 模块，服务接口不应直接实现 dubbo client service，应继承后再实现。
3.应参照该结构，另起一个用于 webmvc 的框架。框架中不应有持久层相关，所有数据应走接口。

11.20 API 模块已抽离并运行良好，第 2 点未能完成，API 提供 service，服务端继承该 service，命令为 serverservice，再进行实现。
而实际过程中，注册 zookeeper 时，会注册 serverservice 而不是 service，客户端访问不到 serverservice 只能注入 service，导致注入失败。

mail: kehuimail@gmail.com
QQ:1900149831