package com.webshop.init;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.webshop.config.MainSpringContextConfig;
import com.webshop.config.MainSpringMvcContextConfig;


//En étendant la classe abstraite, on indique à Spring d'initialiser les contextes à partir d'ici
//(plus besoin d'un fichier web.xml)
public class ContextInitializer extends
    AbstractAnnotationConfigDispatcherServletInitializer {

  @Override
  protected Class<?>[] getRootConfigClasses() {
    return new Class<?>[] {MainSpringContextConfig.class};
  }

  @Override
  protected Class<?>[] getServletConfigClasses() {
    return new Class<?>[] {MainSpringMvcContextConfig.class};
  }

  @Override
  protected String[] getServletMappings() {
    return new String[] {"/"};
  }

}
