package io.geekidea.cloud.generator;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import io.geekidea.cloud.generator.config.GeneratorStrategy;
import io.geekidea.cloud.generator.constant.GeneratorConstant;
import io.geekidea.cloud.generator.properties.GeneratorProperties;
import org.springframework.stereotype.Component;

/**
 * spring-cloud-plus代码生成器入口类
 *
 * @author geekidea
 * @date 2020-4-26
 **/
@Component
public class ScpGenerator {

    /**
     * 生成代码
     *
     * @param args
     */
    public static void main(String[] args) {
        GeneratorProperties generatorProperties = new GeneratorProperties();

        // 设置基本信息
        generatorProperties
                .setServerName("vip")
                .setMavenModuleName("vip")
//                .setMavenApiModuleName("scp-example-api")
//                .setMavenServerModuleName("scp-example-server")
                .setParentPackage("com.qt.vip")
                .setModuleName("proposal")
                .setAuthor("mal")
                .setFileOverride(true);

        // 设置表信息
        generatorProperties.addTable("proposal", "id");

        // 设置表前缀
        // generatorProperties.setTablePrefix(Arrays.asList("tb_"));

        // 数据源配置
        generatorProperties.getDataSourceConfig()
                .setDbType(DbType.MYSQL)
                .setUsername("root")
                .setPassword("Teach000")
                .setDriverName("com.mysql.jdbc.Driver")
                .setUrl("jdbc:mysql://139.9.68.41:3306/vip?useUnicode=true&characterEncoding=UTF-8&useSSL=false");

        // 生成配置
        generatorProperties.getGeneratorConfig()
                .setGeneratorStrategy(GeneratorStrategy.SINGLE)
                .setGeneratorEntity(true)
                .setGeneratorController(true)
                .setGeneratorService(true)
                .setGeneratorServiceImpl(true)
                .setGeneratorMapper(true)
                .setGeneratorMapperXml(true)
                .setGeneratorPageQuery(true)
                .setGeneratorVo(true)
                .setPageListOrder(true)
                .setParamValidation(true)
                .setSwaggerTags(true)
                .setRequiresPermissions(false)
                .setOperationLog(false)
                .setGeneratorFeignClient(true)
                .setGeneratorFeignClientFallback(true)
                .setGeneratorFeignClientFactory(true);

        // 全局配置
        generatorProperties.getMybatisPlusGeneratorConfig().getGlobalConfig()
                .setOpen(false)
                .setSwagger2(true)
                .setIdType(IdType.AUTO)
                .setDateType(DateType.ONLY_DATE);

        // 策略配置
        generatorProperties.getMybatisPlusGeneratorConfig().getStrategyConfig()
                .setNaming(NamingStrategy.underline_to_camel)
                .setColumnNaming(NamingStrategy.underline_to_camel)
                .setEntityLombokModel(true)
                .setRestControllerStyle(true)
                .setControllerMappingHyphenStyle(true)
                .setVersionFieldName(GeneratorConstant.VERSION)
                .setLogicDeleteFieldName(GeneratorConstant.DELETED);

        // 包信息配置
        generatorProperties.getMybatisPlusGeneratorConfig().getPackageConfig()
                .setEntity(GeneratorConstant.API_ENTITY_PACKAGE);

        // 生成代码
        CodeGenerator codeGenerator = new CodeGenerator();
        codeGenerator.generator(generatorProperties);

    }


}
