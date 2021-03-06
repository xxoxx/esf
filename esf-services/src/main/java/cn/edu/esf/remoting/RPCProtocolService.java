package cn.edu.esf.remoting;

import cn.edu.esf.domain.ESFRequest;
import cn.edu.esf.exception.ESFException;
import cn.edu.esf.model.matedata.ServiceMetadata;

import java.lang.reflect.Method;

/**
 * RPC服务协议，负责最后远程调用
 *
 * @Author heyong
 * @Date 2017/1/4
 */
public interface RPCProtocolService {


    /**
     * 发起服务的调用
     * @param metadata
     * @param method
     * @param methodName
     * @param parameterTypes
     * @param args
     * @return
     * @throws ESFException
     * @throws Throwable
     */
    public Object invoke(ServiceMetadata metadata, Method method, String methodName,
                         Class<?>[] parameterTypes, Object[] args) throws ESFException, Throwable;


    /**
     * 服务的注册
     *
     * @param metadata
     * @throws ESFException
     */
    public void registerProvider(ServiceMetadata metadata) throws ESFException;


    /**
     * 验证服务地址是否有效
     *
     * @param targetURL
     * @return
     */
    public boolean validTarget(String targetURL);
}
