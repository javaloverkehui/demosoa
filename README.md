# demosoa

初版主要用于尝试。
集成项包括 Spring boot + Mybatis + dubbo 
花时间比较多的就是解决一主多从的情况下，数据源切换的问题。项目结构已经出来了，后续补上 mybatis-generator 自动生成读写模块的代码。

该项目可作为公司项目 SOA 框架的 demo，后续不会涉及业务，只用于框架模板，以下几部分待完善。
1.dubbo client service + database model + enum + request param + request result 分离出来，独立出一个 API 模块，用于外部依赖。
2.服务层依赖 API 模块，服务接口不应直接实现 dubbo client service，应继承后再实现。
3.应参照该结构，另起一个用于 webmvc 的框架。框架中不应有持久层相关，所有数据应走接口。

尾注：
项目中用到的，一部分来源于网络，包括但不仅限于官网示例、个人博客、github 开源项目等，中间经过了一定的整理和个人理解。因为学习过程中，参考的内容较多，未能详细记录来源。如有雷同，不是巧合。

mail: kehuimail@gmail.com
QQ:1900149831