/**
 *
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package org.apache.tuscany.samples.sdo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.apache.tuscany.samples.sdo.specCodeSnippets.AccessDataObjectPropertiesByName;

public class ExecuteSamples2 {
  
  public static Class[] sampleClasses = {
    org.apache.tuscany.samples.sdo.otherSources.CreateCompany.class,     // NOVICE level samples
    AccessDataObjectPropertiesByName.class,
    
    org.apache.tuscany.samples.sdo.tuscanyapi.CreateCompany.class        // INTERMEDIATE level samples
                                                                         // ADVANCED level samples
   
  };
  
  public static Class[] constructorArgTypes = { Integer.class };

  /*
   * Edit the value of this argument to one of NOVICE, INTERMEDIATE or ADVANCED to see
   * more or less commentary.  Note,  this value only controls the level of commentary,
   * not which samples are executed.  Use it to filter out the noise if you have already
   * understood the more basic commentary.
   */
  public static Object[] constructorArgs = { SampleInfrastructure.NOVICE };  
  
  public static void main(String [] args) throws SecurityException, NoSuchMethodException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {

//    
    for (int i=0; i < sampleClasses.length; i++) {
      Constructor c = sampleClasses[i].getConstructor(constructorArgTypes);
      SampleBase sample = (SampleBase)c.newInstance(constructorArgs);
      sample.run();
    }
    
  }
}
