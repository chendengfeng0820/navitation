package com.navigation.mapper;

import com.navigation.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserMapper {
	/**
	 * 增加用户
	 * @param user
	 */
	void saveUser(User user);


	/**
	 * 删除用户
	 * @param number
	 */
	void deleteUser(Integer number);


	/**
	 * 修改用户
	 * @param user
	 */
	void updateUser(User user);


	/**
	 * 根据number查找用户
	 * @param number
	 * @return
	 */
	public User findByNumber(Integer number);


	/**
	 * 查找所有用户
	 * @return
	 */
	List<User> findAll();

	/**
	 * 显示用户详细信息
	 */
	User information(Integer number);

}
