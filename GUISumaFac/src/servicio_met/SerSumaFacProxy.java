package servicio_met;

public class SerSumaFacProxy implements servicio_met.SerSumaFac {
  private String _endpoint = null;
  private servicio_met.SerSumaFac serSumaFac = null;
  
  public SerSumaFacProxy() {
    _initSerSumaFacProxy();
  }
  
  public SerSumaFacProxy(String endpoint) {
    _endpoint = endpoint;
    _initSerSumaFacProxy();
  }
  
  private void _initSerSumaFacProxy() {
    try {
      serSumaFac = (new servicio_met.SerSumaFacServiceLocator()).getserSumaFac();
      if (serSumaFac != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)serSumaFac)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)serSumaFac)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (serSumaFac != null)
      ((javax.xml.rpc.Stub)serSumaFac)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public servicio_met.SerSumaFac getSerSumaFac() {
    if (serSumaFac == null)
      _initSerSumaFacProxy();
    return serSumaFac;
  }
  
  public int factorial(int a) throws java.rmi.RemoteException{
    if (serSumaFac == null)
      _initSerSumaFacProxy();
    return serSumaFac.factorial(a);
  }
  
  public int sumar(int a, int b) throws java.rmi.RemoteException{
    if (serSumaFac == null)
      _initSerSumaFacProxy();
    return serSumaFac.sumar(a, b);
  }
  
  
}