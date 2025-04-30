package me.shinsunyoung.springbootdeveloper.todoList.apiPayload.exception;
import lombok.AllArgsConstructor;
import lombok.Getter;
import me.shinsunyoung.springbootdeveloper.todoList.apiPayload.code.BaseErrorCode;
import me.shinsunyoung.springbootdeveloper.todoList.apiPayload.code.ErrorReasonDto;

@Getter
@AllArgsConstructor
public class GeneralException extends RuntimeException{
    private BaseErrorCode code;
    public ErrorReasonDto getErrorReasonHttpStatus(){
        return this.code.getReasonHttpStatus();
    }
}
