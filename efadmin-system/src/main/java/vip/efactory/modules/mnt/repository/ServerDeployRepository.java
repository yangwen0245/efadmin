package vip.efactory.modules.mnt.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import vip.efactory.ejpa.base.repository.BaseRepository;
import vip.efactory.modules.mnt.domain.ServerDeploy;

/**
 * @author zhanghouying
 * @date 2019-08-24
 */
public interface ServerDeployRepository extends BaseRepository<ServerDeploy, Long>, JpaSpecificationExecutor<ServerDeploy> {

    /**
     * 根据IP查询
     *
     * @param ip /
     * @return /
     */
    ServerDeploy findByIp(String ip);
}
